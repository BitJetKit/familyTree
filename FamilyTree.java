import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// Program: Family Tree
// Author: 	Jonathan Kelly
// Date:	1 May 2017
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
 * 			For the algorithm, a List of Lists and an array may be used. An array with entries added and retrieved as a stack runs in O(1) time
 *			and that is all that is required of it. The List of Lists being a new ArrayList would run in O(n) time in the worst-case and
 *			O(1) in the best case.
 */


public class FamilyTree{
		
	public static void main(String[] args)  {
	
	
		List<List<String>> setOfRelatives = new ArrayList<List<String>>();
		
		
		Scanner input = new Scanner(System.in);
		String name_entry;
		String [] names = new String[0];
		/** Greet the user */
			System.out.println("********************************Family tree********************************");
			System.out.println("*                            By Jonathan Kelly                            *");
			System.out.println("***************************************************************************");
			System.out.println("Enter 'z' at any time to exit program.");
			
		do
		{
		
			System.out.println("Please enter a family member name: ");
			name_entry = input.next();
			List<String> list = new ArrayList<>();
			if("z".equals(name_entry))
			{
				System.exit(0);
			}
			else if("q".equals(name_entry))
			{
				break;
			}
			else
			{
				names = addElement(names, name_entry);
				list.add(name_entry);
				System.out.println("About " + name_entry + ", please enter a set of relationships for this family member.");
			}
			
			
			/** Loop through and find relationships for each family member */
			
			
			
			System.out.println("The family relationships are as follows: ");
			while(!"z".equals(name_entry) || !"q".equals(name_entry))
			{   
				System.out.println("Related to " + names[names.length - 1] + " (press 'q' to exit sequence or 'z' to exit program): ");
				name_entry = input.next();
				if (list.contains(name_entry))
				{
					break;
				}
				else if("z".equals(name_entry))
				{
					System.exit(0);
				}
				else if("q".equals(name_entry))
				{
					break;
				}
				else
				{
					//  put the set of relative names array in list
					list.add(name_entry);
				}
			}
			setOfRelatives.add(list);
			
		}while(!"q".equals(name_entry) || !"z".equals(name_entry));
	
		
		/** Display the relationships */
		
		System.out.println("The relationships between family members are as follows: ");
		for (List<String> relatives: setOfRelatives)
		{
			System.out.println(relatives);
		}
		
		// Print the relationships by column
		
	}

	static String[] addElement(String[] a, String e){
		a = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}
}
