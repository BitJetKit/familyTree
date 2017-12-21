import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

// Program: Family Tree
// Author: 	Jonathan Kelly
// Date:	26 April 2017
// Purpose:	The purpose of this app is the development of a family tree
//			using data structures and algorithms that would optimize run-time performance
//			and ease-of-use through automation.
/*			While a tree might be an effective data-structure for n nodes then (n - 1) edges
 *			but a undirected graph would be more effective for two parents mutually related for their 
 *			parents and children, and this process could expand.
 *			Unordered pair:
 *			{a, b} = {b,a}
 *			While there could be an directed graph for an entire family, the relationships might not be mutual
 *			For purposes of establishing relationships, there could be a combination of undirected and directed graph
 *			elements, but an undirected graph can the links between family by inheritance in terms of grandparents, parents
 *			and children. 
 * 			
 * 			For adding family members, the undirected graph can link undirectly related family members.
 * 			For this, we can find all nodes having a length of shortest path from one family member equal to 2.
 *			The formal notation for the Graph is G = (V,E) with vertices V and edges E.
 *			For the algorithm, we could use an ArrayList in Java for the Vertex List with one element per entry and an Edge List
 *			with two edges for two edges from two vertices to one vertex representing a child and parents.
 */


public class FamilyTree{
		
	public static void main(String[] args)  {
		
		String[] name = new String[10000];
		String [][] edge = new String[10000][10000];
		int counter = 0;
		int counter2 = 0;
		Scanner scan = new Scanner(System.in);
		String input;
		/** Greet the user */
			System.out.println("********************************Family tree********************************");
			System.out.println("*                            By Jonathan Kelly                            *");
			System.out.println("***************************************************************************");
			System.out.println("Enter 'z' at any time to exit program.");
			
			System.out.println("Hello. Please enter a family member name: ");
	
		do 
		{
			System.out.println("Please enter a family member name for a set of relationships: ");
			input = scan.nextLine();
			name[counter] = input;
		
			if(input.equals("z"))
			{
				System.exit(0);
			}
			if(input.equals("r"))
			{
				break;
			}
			// resize the array
			System.out.println("Enter 'q' to move to the next set of relationships then 'r' to display family tree.");
				// request information
				System.out.println("Who is " + name[counter] + " related to? ");
				System.out.println("Enter a relative of " + name[counter] + "'s: ");
				name[counter + 1] = scan.nextLine();
				
				
					// loop through for family member data
				while(!input.equals("q"))
				{
					counter2 = 0;
					// get the info
					System.out.println("Who else is related to " + name[counter] + "?");
					System.out.println("Enter the name of " + name[counter] + "'s relative: ");
					System.out.println("Thank you. ");
				
					// 	entry for a column  
					input = scan.nextLine();
					edge[counter][counter2] = input;
					if(input.equals("q"))
						{
							break;
							
						}
					else if(input.equals("z"))
					{
						System.exit(0);
					}
						counter2++;				
				}
				// 	iterate to new column
				counter++;
			
				
		} while (!input.equals("r") || !input.equals("z"));
			
		/** Loop through and find relationships for each family member */
		
		
		/** Display the relationships */
		System.out.println("The family relationships are as follows: ");	
		for(int i = 0; i < edge[0].length; i++) {
			for(int j = 0; j < edge.length; j++) {
				if(edge[j][i] != null)
				System.out.printf("%s ", edge[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println("Thank you for using Family tree. Have a good day. ");
	}
}
