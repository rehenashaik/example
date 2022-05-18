package loops;

import java.util.ArrayList;
import java.util.List;

public class StudentApplication {
   int stdid ;

    public String getStdname() {
        return stdname;
    }

    String stdname;

    public String getStdbranch() {
        return stdbranch;
    }

    String stdbranch;
   float stdmarks;

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public static void main(String[] args) {
        StudentApplication sa = new StudentApplication();
        sa.stdid = 10;
        sa.stdname = "rehana";
        sa.stdbranch = "cse";
        sa.stdmarks = 85.4f;
        StudentApplication sa1 = new StudentApplication();
        sa1.stdid = 18;
        sa1.stdname = "renuka";
        sa1.stdbranch = "cse";
        sa1.stdmarks = 89.4f;

        List <StudentApplication> list =  new ArrayList<>() ;
        list.add(sa);
        list.add(sa1);
        {
            for (int i =1;i< sa1.stdmarks;i++){
            }

        }





        }
            }












