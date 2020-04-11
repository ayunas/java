public class KbToMb {


    public static void main(String[] args) {

        if (args.length == 0) System.out.println(-1);
        else {
            int val1 = Integer.parseInt(args[0]);
            kbMb(val1);
        }


    }

    public static void kbMb(int kbs) {
        if (kbs < 0) {
            System.out.println("Invalid Value");
        } else {
            int mbs = Math.round(kbs / 1024);
            int remaining = kbs % 1024;
            System.out.println(kbs + " KBs = " + mbs + " MBs and " + remaining + " KB");
        }
    }
}
