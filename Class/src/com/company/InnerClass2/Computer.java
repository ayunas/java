package InnerClass2;

public class Computer {
    CPU cpu;
    Motherboard motherboard;

    public static void main(String[] args) {
        Computer comp = new Computer(2.4,4,"ATX");
        System.out.println(comp.cpu.cores);
        System.out.println(comp.motherboard.type);
    }

    Computer(double speed,int cores, String type) {
        Computer.CPU cpu = new CPU(speed,cores);
        Computer.Motherboard motherboard = new Motherboard(type);
        this.cpu = cpu;
        this.motherboard = motherboard;
    }

    void showStats() {
        System.out.println(this.cpu.speed);
        System.out.println(this.motherboard.type);
    }

    static class CPU {
        private double speed;
        private int cores;

        CPU(double speed, int cores) {
            this.speed = speed;
            this.cores = cores;
        }

        void showStats() {
//            Computer.this.showStats();
        }

        public double getSpeed() {
            return this.speed;
        }

        public int cores() {
            return this.cores;
        }

    }

    static class Motherboard {
        private String type;

        Motherboard(String type) {
            this.type = type;
        }

    }






}
