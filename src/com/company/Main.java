package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company("Synopsis", " Երևան Արշակունյաց պող., 41 ", 50, " https://www.google.com/maps/place/Synopsys+Armenia/@40.1553023,44.5024341,15z/data=!4m2!3m1!1s0x0:0xb98d122f7cc9db0b?sa=X&ved=2ahUKEwi7svq2lrDmAhUiSBUIHdVwCmoQ_BIwCnoECA4QCA", "http://www.synopsys.am");
        Company company2 = new Company("ACA", " 3 Հակոբ Հակոբյան փողոց, Երևան 0001", 30, " https://www.google.com/maps/place/ACA(Armenian+Code+Academy)/@40.1988876,44.4907405,15z/data=!4m5!3m4!1s0x0:0x31ea9da813693c2e!8m2!3d40.1988876!4d44.4907405", "https://aca.am/en/");
        Company company3 = new Company("Tumo", " ул. Алабяна, 16", 20, " https://www.google.com/maps/place/Тумо/@40.1965181,44.479984,15z/data=!4m2!3m1!1s0x0:0x6f5b51aee4e64196?sa=X&ved=2ahUKEwj2-PCGm7DmAhVvThUIHR5aCpUQ_BIwCnoECBYQCA ", "https://tumo.org/");
        Company company4 = new Company("Skynet", " 50/1 Mamikoniants St, Yerevan", 60, " https://www.google.com/search?sxsrf=ACYBGNTwrXc3wfBsxXwgf0mX0mTRiUyldQ:1576157359291&q=skynet&npsic=0&rflfq=1&rlha=0&rllag=40356503,44702231,30412&tbm=lcl&ved=2ahUKEwie0Ircm7DmAhVzo3EKHQzEDzsQtgN6BAgMEAQ&tbs=lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:13245859052266311063;mv:[[62.2853237,74.14332809999999],[20.222612299999998,-1.9500065999999996]]", "http://skynet.am/");

        HashMap<String, Company> company = new HashMap<>();
        company.put("Synopsis", company1);
        company.put("ACA", company2);
        company.put("Tumo", company3);
        company.put("Skynet", company4);
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();
        if (company.containsKey(companyName)) {
            System.out.println(company.get(companyName));

        } else {
            System.out.println("Incorrect company name ");
        }
    }
}
