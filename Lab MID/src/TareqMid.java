import com.mycompany.tareq.mid.Contact;

public class TareqMid {


    TareqMid() {

    }

    public static void main(String[] args) {

            Contact contact =new Contact();

            for(int i = 0; i<3; i++){
                contact[i] = new Contact();

            }

            void displayAllContacts(){

                for(int i=0; i<3;i++){
                    contact[i].displayContactInfo(contact[i].name);

                }

            }
            displayAllContacts();



        }
    }


}
