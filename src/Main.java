public class Main {
    public static void main(String [] args){
        System.out.println("Hello World!");

        class Contact{
            String name;
            String email;
            String phone;
        }

        class ContactManager{
            Contact [] myFriends;
            int friendsCount;

            ContactManager(){
                friendsCount = 0;
                myFriends = new Contact[500];
            }

            void addContact(Contact contact){
                myFriends[friendsCount] = contact;
                friendsCount++;
            }
            
        }

    }
}
