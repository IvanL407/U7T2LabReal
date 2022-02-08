import java.util.ArrayList;

/**
 * This class represents a Used Car Lot
 *
 * @author Ivan Luc
 */

public class UsedCarLot
{
    /** The array that the cars are stored in */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object.
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the inventory.
     * @return The inventory
     */
    public ArrayList getInventory()
    {
        return inventory;
    }

    /**
     * Adds a new car to the inventory.
     * @param car A new car
     */
    public void addCar(Car car)
    {
        inventory.add(car);
    }

    /**
     * Swaps position of cars in the inventory.
     * @param firstSpot The index in the inventory where the car in the second spot will go.
     * @param secondSpot The index in the inventory where the car in the first spot will go.
     * @return true if the swap is successful, false otherwise.
     */
    public boolean swap(int firstSpot, int secondSpot)
    {
        if (firstSpot < inventory.size() && secondSpot < inventory.size() && firstSpot > 0 && secondSpot > 0) {
            Car placeholderFirst = inventory.get(firstSpot);
            inventory.set(firstSpot, inventory.get(secondSpot));
            inventory.set(secondSpot, placeholderFirst);
            return true;
        }
        else
        {
            return false;
        }
    }

   /* Adds a Car to the inventory list at the index specified
   by indexToAdd; this method increases the size of inventory by 1
   PRECONDITION: 0 <= indexToAdd < inventory.size()
   DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
   like you did the other addCar method; also note that this method is void
*/

    /**
     * Adds a new car to the inventory in a chosen index.
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * @param indexToAdd The index in the inventory where the car will go.
     * @param carToAdd The new car being added to the inventory.
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

   /* "sells" the Car located at indexOfCarToSell which
       removes it from the inventory list and shifting the remaining
       Cars in the inventory list to the left to fill in the gap;
       this method reduces the size of inventory by 1

       Returns the Car that is being "sold" (removed from lot)

       PRECONDITION: indexOfCarToSell < inventory.size()

       HINT: the ArrayList remove() method returns the removed element while also
             removing it from the ArrayList
     */

    /**
     * Removes the car of chosen index from the list. The rest of the cars move up in the inventory.
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell The index of the car being removed.
     * @return The car that was removed.
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car carSold = inventory.remove(indexOfCarToSell);
        return carSold;
    }

   /* "sells" the Car located at indexOfCarToSell,
      but instead of removing it and shifting the inventory
      list to the left, REPLACE the Car at indexOfCarToSell
      with NULL, thus creating an "empty parking spot" on the lot;
      this method does NOT reduce the size of inventory by 1

      PRECONDITION: indexOfCarToSell < inventory.size()

      This method returns the Car that is being "sold" (replaced with null)
    */

    /**
     * Removes the car of chosen index from the list. The index is replaced with null.
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @param indexOfCarToSell The index of the car being removed.
     * @return The car that was removed.
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car carSold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return carSold;
    }

   /* moves Car located at index indexOfCarToMove to index destinationIndex;
      if destinationIndex > indexOfCarToMove, moves the Car to the right in
      inventory; if destinationIndex < indexOfCarToMove, moves the
      Car to the left in the inventory. All other cars in the inventory
      should shift accordingly

      PRECONDITIONS: indexOfCarToMove < inventory.size()
                     destinationIndex < inventory.size()
    */

    /**
     * Moves the car to a different spot in the inventory.
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     * @param indexOfCarToMove The index of the car being moved.
     * @param destinationIndex The new index of the car being moved.
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car move = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, move);
    }
}

