
package lab_6;

/**
 *
 * Lab6 Assignment
 *      Rob     -   jarmusz.r@northeastern.edu
 *      Zefan   -   sun.zef@northeastern.edu
 *      Patrick -   wande.p@northeastern.edu
 *      Ornella -   nibasumba.o@northeastern.edu
 * 
 */
public class TeamGreeting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Member_Rob m1 = new Member_Rob();
        m1.greeting();
        Member_Patrick m2 = new Member_Patrick();
        m2.greeting();
        Member_Zefan m3=new Member_Zefan();
        m3.greeting();
    }
    
}
