public class TV {
    //variables
    int volume, channel;
    boolean power;

    //constructors
    TV() {
        volume = 0;
        channel = 1;
        power = false;
    }

    TV(int newVolume, int newChannel, boolean status) {
        if (newVolume == 0 || newVolume <= 30) {
            volume = newVolume;
        } else {
            return;
        }
        if (newChannel == 1 || newChannel <= 120)
            channel = newChannel;
        else
            return;
        power = status;
    }

    //methods
    //power on /off
    void powerOn() {
        if (power == false)
            power = true;
        else
            System.out.println("tv is already turned on!");
    }

    void powerOff() {
        if (power == true)
            power = false;
        else
            System.out.println("tv is already turned off!");
    }

    //volume up / down
    void volumeUp() {
        if (volume < 30)
            volume++;
        //volume = volume + 1;
        else
            System.out.println("maximum volume reached!");
    }

    void volumeDown() {
        if (volume > 0)
            volume--;
        //volume = volume - 1;
        else
            System.out.println("minimum volume reached!");
    }

    //setchannel
    void setChannel(int newChannel) {
        if (newChannel == 1 || newChannel <= 120)
            channel = newChannel;
        else
            System.out.println("invalid channel!");
    }

    //channel up/down
    void channelUp() {
        if (channel < 120)
            channel++;
        else
            channel = 1;
    }

    void channelDown() {
        if (channel > 1)
            channel--;
        else
            channel = 120;
    }

    //display
    void display() {
        System.out.println("power: " + power);
        System.out.println("volume: " + volume);
        System.out.println("channel: " + channel);
    }

    //main method
    public static void main(String[] args) {
        TV just = new TV();
        just.powerOn();
        just.volumeUp();
        just.setChannel(110);
        just.channelUp();
        just.channelDown();
        just.powerOff();
        just.display();
    }
}
