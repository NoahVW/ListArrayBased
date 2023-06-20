// ********************************************************
// Array-based implementation of the ADT Sorted List.
// *********************************************************
 /**
 * class SortredListArrayBased
 *
 *    A class gets inherited from ListArrayBased
 *
 */

public class SortedListArrayBased extends ListArrayBased
{

  	public SortedListArrayBased()
  	// creates an empty list
  	{
		// TO BE IMPLEMENTED BY YOU
		super();
  	}// end default constructor

  	public void add(Object item) throws ListException
  	// Inserts item into its proper position in a sorted list
  	// Throws an exception if the item connot be placed on the list
  	{
		try
		{
			int addIndex = locateIndexToAdd(item);
			super.add(addIndex, item);	
		}
		catch(Exception e)
		{
			throw new ListException("Add to List failed:  " + e.toString());
		}

	}

  	public void remove(Object item) throws ListException
  	// Removes the item from a sorted list.
  	// Throws an exception if the item is not found.
  	{
		try
		{
			// TO BE IMPLEMENTED BY YOU
			int removeIndex = locateIndexToRemove(item);
			super.remove(removeIndex);
		}
		catch(Exception e)
		{
			throw new ListException("Remove " + item.toString() + " from List failed:  " + e.toString());
		}
	}

    public int locateIndexToAdd(Object item)
	{
		for (int i = 0; i < size(); i++)
			if (get(i).toString().compareTo(item.toString())>0)
			return i;
		return 0;
	}

  	public int locateIndexToRemove(Object item)
  	// Returns the position where the item belongs or exists in a sorted list;
  	// Otherwise, it returns -1.
  	{
		for (int i = 0; i < size(); i++){
				if (item.toString().compareTo(get(i).toString()) == 0)
			return i;
			}
		return -1;
	}
}	  // end SortedListArrayBased


