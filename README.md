# gitTutorial

### Description
This repository contains the results of following the class tutorial on creating a github repository from the command prompt.

After the second commit, the Main.java is no longer a simple "Hello World" app, now it is a PhoneBook program that:

1) Reads the number of total contacts
```JAVA
int n = in.nextInt();
```
2) Initializes a Dictionary data structure to read and store all contacts
```JAVA
Map<String, Integer> phoneBook = new HashMap<String, Integer>();
for (int i = 0; i < n; i++) {
  System.out.print("Contact name & number: ");
  String name = in.next();
  int phone = in.nextInt();
  phoneBook.put(name, phone);
}
```
3) Reads from the user names of possible contacts, and if they are found prints their contact information, else it prints "not found"
```JAVA
while (in.hasNext()) {
  String s = in.next();
  if (phoneBook.get(s) != null) {
    System.out.println(s + "=" + phoneBook.get(s));
  } else {
    System.out.println("Not found");
  }
}
```

### File Structure
The reason for the file distribution being src/com/company/Main.java is because IntelliJ creates that file structure.

### Author
Gonzalo Calleja
