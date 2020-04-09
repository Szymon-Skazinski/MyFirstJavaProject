 class Main {
     public static void main(String[] args) {
        ContactManager myContactManager = new ContactManager();

        Contact contact1 = new Contact();
        contact1.name = "Grzegorz";
        contact1.phone = "123456";
        myContactManager.addContact(contact1);

         Contact contact2 = new Contact();
         contact2.name = "Magda";
         contact2.phone = "128886";
         myContactManager.addContact(contact2);

         Contact contact3 = new Contact();
         contact3.name = "Izabela";
         contact3.phone = "125556";
         myContactManager.addContact(contact3);

         Contact contactNumber = myContactManager.searchContact("Grzegorz");
         String phoneNumber = contactNumber.phone;
         System.out.println(phoneNumber);


     }
 }
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

            Contact searchContact(String searchName){
                for (int i=0; i<friendsCount;i++)
                {
                    if (myFriends[i].name.equals(searchName)) {
                        return myFriends[i];
                    }
                }
                return null;
            }
        }

