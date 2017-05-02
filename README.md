# FamilyTree
 Program: Family Tree
 Author: 	Jonathan Kelly
 Date:	1 May 2017
 Purpose:	The purpose of this app is the development of a family tree
		using data structures and algorithms that would optimize run-time performance
		and ease-of-use through automation.
		While a tree might be an effective data-structure for n nodes then (n - 1) edges
		but a undirected graph would be more effective for two parents mutually related for their 
		parents and children, and this process could expand.
		Unordered pair:
		{a, b} = {b,a}
                While there could be an directed graph for an entire family, the relationships might not be mutual
		For purposes of establishing relationships, there could be a combination of undirected and directed graph
		elements, but an undirected graph can the links between family by inheritance in terms of grandparents, parents
		and children. 
                For adding family members, the undirected graph can link undirectly related family members.
 		For the algorithm, a List of Lists and an array may be used. An array with entries added and retrieved as a stack                         runs in O(1) time and that is all that is required of it. The List of Lists being a new ArrayList would run in                             O(n) time in the worst-case and O(1) in the best case.
