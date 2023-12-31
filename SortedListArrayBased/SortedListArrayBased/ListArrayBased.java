// ********************************************************
// Array-based implementation of the ADT list.
// *********************************************************

public class ListArrayBased implements ListInterface {

  private static final int MAX_LIST = 50;
  private Object items[];  // an array of list items
  private int numItems;  // number of items in list

//test

  public ListArrayBased() {
    items = new Object[MAX_LIST];
    numItems = 0;    
  }  // end default constructor

  public boolean isEmpty() {
    // TO BE IMPLEMENTED (or CORRECTED) BY YOU
    return (numItems==0);
  } // end isEmpty

  public int size() {
    // TO BE IMPLEMENTED (or CORRECTED) BY YOU
    return numItems;
  }  // end size

  public void removeAll() {
    // Creates a new array; marks old array for
    // garbage collection.
    // TO BE IMPLEMENTED (or CORRECTED) BY YOU
      items = new Object[MAX_LIST];
      numItems = 0;
  } // end removeAll

  public void add(int index, Object item)
                  throws  ListIndexOutOfBoundsException {
    if (numItems >= MAX_LIST) {
      throw new ListException("ListException on add");
}  // end if
    if (index >= 0 && index <= numItems) {
      // make room for new element by shifting all items at
      // positions >= index toward the end of the
      // list (no shift if index == numItems)
      for (int pos = numItems-1; pos >= index; pos--) {
    	// TO BE IMPLEMENTED (or CORRECTED) BY YOU
            items[pos + 1] = items[pos];
      } // end for
      // insert new item
      items[index] = item;
      numItems++;
    }
    else {  // index out of range
      throw new ListIndexOutOfBoundsException(
       "ListIndexOutOfBoundsException on add");
    }  // end if
  } //end add

  public Object get(int index)
                    throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
	   // TO BE IMPLEMENTED (or CORRECTED) BY YOU
      return items[index];
    }
    else  {  // index out of range
      throw new ListIndexOutOfBoundsException(
        "ListIndexOutOfBoundsException on get");
    }  // end if
  } // end get

  public void remove(int index)
                     throws ListIndexOutOfBoundsException {
    if (index >= 0 && index < numItems) {
      // delete item by shifting all items at
      // positions > index toward the beginning of the list
      // (no shift if index == size)
      for (int pos = index+1; pos < size(); pos++) {
    	 // TO BE IMPLEMENTED (or CORRECTED) BY YOU
          items[pos-1] = items[pos];
      }  // end for
      numItems--;
    }
    else {  // index out of range
      throw new ListIndexOutOfBoundsException(
                "ListIndexOutOfBoundsException on remove");
    }  // end if
  } // end remove

  public String toString()
  {
    // TO BE IMPLEMENTED (or CORRECTED) BY YOU
	  return null;
  }

  public void reverse()
  {
    // TO BE IMPLEMENTED (or CORRECTED) BY YOU
  }

  public Object findMToLast(int m)
  {
    // TO BE IMPLEMENTED (or CORRECTED) BY YOU
    return null;
  }


}  // end ListArrayBased
