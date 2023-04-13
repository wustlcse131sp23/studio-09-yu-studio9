package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameToHeight {
    /**
     * Construct and fill a map with your studio group members' names, each
     * associated with his or her height.
     *
     * Construct an ArgsProcessor and loop asking the args processor for a name to
     * lookup the height. When the user cancels (that is: when args processor
     * returns null), break from the loop. Otherwise, loop up the name in the map
     * and output the results. Be sure to handle the case where the map does not
     * contain a specified name.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> nameToHeight = new HashMap<>();

        nameToHeight.put("Anthony", 194);

        while (true) {
            System.out.print("Enter a name to look up the height (type 'quit' to exit): ");
            String inputName = in.nextLine();

            if (inputName.equalsIgnoreCase("quit")) {
                break;
            }

            Integer height = nameToHeight.get(inputName);
            if (height == null) {
                System.out.println("Name not found in the map.");
            } else {
                System.out.println(inputName + " has a height of " + height + " cm.");
            }
        }

        in.close();
    }
}
