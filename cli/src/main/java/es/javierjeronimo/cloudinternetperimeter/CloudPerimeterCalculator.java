/**
 * Created by n198908 on 17/10/2020.
 */

package es.javierjeronimo.cloudinternetperimeter;

@Command()
public class CloudPerimeterCalculator implements Runnable {
    public static void main(String[] args) {
        CommandLine.run(new CloudPerimeterCalculator(), args);
    }
}
