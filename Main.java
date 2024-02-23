import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String next = scanner.nextLine();
        String[] split = next.split(" ");
        if (split.length != 6) throw new DataSizeException();
        String surname = split[0];
        String name = split[1];
        String patronymic = split[2];
        String date = split[3];
        if (!DateValidator.isValidDate(date)) throw new DataFormatException();
        String phone_number = split[4];
        if (!DigitValidator.isValidNumber(phone_number)) throw new DigitFormatException();
        String male = split[5];
        if (!MaleValidator.isValidMale(male)) throw new MaleFormatException();
        String fn = surname + ".txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(fn,true);
            fw.write(String.format("<%s> <%s> <%s> <%s> <%s> <%s>\n", surname,name, patronymic, date, phone_number,male));
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
