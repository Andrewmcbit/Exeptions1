//import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

public class Person extends Information {

    public void setInfo(String inf){
        /*Scanner input = new Scanner(System.in);
        System.out.print("Input full name: ");
        inf = input.next();
        input.close();*/
        this.info = inf;
    }
    
    public void splitInfo(){
        String[] temp = info.split(" ");
        if (temp.length == 6){
            try {
                secondName = temp[0];
                firstName = temp[1];
                surName = temp[2];
                birth_date = format.parse(temp[3]);
                phone_number = Long.parseLong(temp[4]);
                gender = temp[5].charAt(0);
                try(FileWriter writer = new FileWriter(String.format("%s.txt",secondName), true)) { //
                    writer.write(info + "\n");
                    writer.flush();
                } catch (IOException e){
                    e.getStackTrace();
                } 
            } catch (NumberFormatException e){
                System.out.println("Wrong format of the entering phone number");
            } catch (ParseException e) {
                System.out.println("Wrong format of the entering date");
            } catch (IndexOutOfBoundsException e){
                System.out.println("Wrong format of the entering gender");
            }
        } else {
            System.out.println("Incorrect format of the entered string.");
        }
    }
}