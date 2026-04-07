import java.util.*;
class Patient {
int id;
String name;
int age;
Patient(int id, String name, int age) {
this.id = id;
this.name = name;
this.age = age;
}
void display() {
System.out.println(id + " " + name + " " + age);
}
}
public class Main { // ⚠️ Important: class name must be Main
static ArrayList<Patient> patients = new ArrayList<>();
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while (true) {
System.out.println("1 Add\n2 View\n3 Search\n4 Exit");
int choice = sc.nextInt();
if (choice == 1) {
int id = sc.nextInt();
String name = sc.next();
int age = sc.nextInt();
patients.add(new Patient(id, name, age));
System.out.println("Added");
}
else if (choice == 2) {
if (patients.isEmpty()) {
System.out.println("No Data");
} else {
for (Patient p : patients) {
p.display();
}
}
}

else if (choice == 3) {
int id = sc.nextInt();
boolean found = false;
for (Patient p : patients) {
if (p.id == id) {
p.display();
found = true;
break;
}
}
if (!found) System.out.println("Not Found");
}
else {
break;
}
}
}
}