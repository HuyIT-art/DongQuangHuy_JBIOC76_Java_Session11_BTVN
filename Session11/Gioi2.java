package Session11;

import java.util.Scanner;

abstract class Device {
    public int id;
    public String name;

    public abstract void turnOn();

    public abstract void turnOff();

    public void input(Scanner sn) {
        System.out.println("Nhập id: ");
        id = sn.nextInt();
        sn.nextLine();
        System.out.println("Nhập name: ");
        name = sn.nextLine();
    }
}

interface Connectable {
    void connectWifi();
}

interface Chargeable {
    void charge();
}

class SmartPhone extends Device implements Connectable, Chargeable {
    @Override
    public void turnOn() {
        System.out.println("Bật thiết bị");
    }

    public void turnOff() {
        System.out.println("Tắt thiết bị");
    }

    @Override
    public void charge() {
        System.out.println("Sạc");
    }

    @Override
    public void connectWifi() {
        System.out.println("Kết nối");
    }
}

class Laptop extends Device implements Connectable, Chargeable {
    @Override
    public void turnOn() {
        System.out.println("Bật thiết bị");
    }

    @Override
    public void turnOff() {
        System.out.println("Tắt thiết bị");
    }

    @Override
    public void charge() {
        System.out.println("Sạc");
    }

    @Override
    public void connectWifi() {
        System.out.println("Kết nối");
    }
}

class Television extends Device implements Connectable {
    public void turnOn() {
        System.out.println("Bật thiết bị");
    }

    public void turnOff() {
        System.out.println("Tắt thiết bị");
    }

    @Override
    public void connectWifi() {
        System.out.println("Kết nối");
    }
}

public class Gioi2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n, j = 0;
        String choose;
        System.out.println("Nhập số lượng thiết bị: ");
        n = sn.nextInt();
        sn.nextLine();
        Device[] arr = new Device[n];
        while (j < n) {
            System.out.println("SmartPhone | Laptop | Television");
            choose = sn.nextLine();
            if (choose.toLowerCase().equals("smartphone")) {
                SmartPhone sp = new SmartPhone();
                sp.input(sn);
                arr[j] = sp;
                j++;
            } else if (choose.toLowerCase().equals("laptop")) {
                Laptop l = new Laptop();
                l.input(sn);
                arr[j] = l;
                j++;
            } else if (choose.toLowerCase().equals("Television")) {
                Television t = new Television();
                t.input(sn);
                arr[j] = t;
                j++;
            } else {
                System.out.println("Nhập lại: ");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].turnOn();
            arr[i].turnOff();

            if (arr[i] instanceof Connectable) {
                ((Connectable) arr[i]).connectWifi();
            }

            if (arr[i] instanceof Chargeable) {
                ((Chargeable) arr[i]).charge();
            }
        }
    }
}
