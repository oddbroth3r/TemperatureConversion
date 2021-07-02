/* Temperature Conversion
    LaCombe, Ryan
 */

public class TemperatureConversion
{
        public static void main( String [] args )
        {

            //declare the temperature in farenheit as an int
            double fTemp = 212.0;

            //calculate equivilent Celsius temperature
            double cTemp;
            cTemp = (fTemp-32)*(5.0/9.0);

            //output the temperature in Celsius
            System.out.println("The temperature in Celsius is " + cTemp);

            //convert Celsius temp back into farenheit
            fTemp = (9.0/5.0)*cTemp+32;

            //output farenheit temp to check correctness
            System.out.println("The temperature in Farenheit is " + fTemp);

        }
}
