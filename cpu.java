public class cpu {
    int price;

    class processor {
        int cores;
        String producer;

        processor(int noc, String manu) {
            cores = noc;
            producer = manu;
        }

        void display() {
            System.out.println("\nProcessor Info");
            System.out.println("Number of cores = " + cores);
            System.out.println("Manufacturer = " + producer + "\n");
        }
    }

    static class ram {
        int mem;
        String manuf;

        ram(int memory, String producer) {
            mem = memory;
            manuf = producer;
        }

        void display() {
            System.out.println("\nRAM Info");
            System.out.println("Memory = " + mem + " GB");
            System.out.println("Manufacturer = " + manuf + "\n");
        }
    }

    public static void main(String[] args) {
        cpu.ram obj1 = new cpu.ram(8, "Intel"); 
        cpu obj2 = new cpu();         
cpu.processor obj3 = obj2.new processor(8, "Samsung"); 
        obj1.display();       
 obj3.display();    }
}


