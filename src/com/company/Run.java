package com.company;


import com.company.hands.SamsungHand;
import com.company.hands.ToshibaHand;
import com.company.heads.SamsungHead;
import com.company.heads.SonyHead;
import com.company.heads.ToshibaHead;
import com.company.legs.SamsungLeg;
import com.company.legs.SonyLeg;
import com.company.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot Tom = new Robot(new SamsungHead(67), new ToshibaHand(24), new SamsungLeg(33));
        Tom.action();
        System.out.println("--------------------------------------------------------------------------");
        Robot Pit = new Robot(new SonyHead(70), new SamsungHand(25), new ToshibaLeg(38));
        Pit.action();
        System.out.println("--------------------------------------------------------------------------");
        Robot Smit = new Robot(new ToshibaHead(68), new ToshibaHand(24), new SonyLeg(40));
        Smit.action();
        System.out.println("--------------------------------------------------------------------------");
        if (Tom.getPrice() > Pit.getPrice() & Tom.getPrice() > Smit.getPrice())
            System.out.println("Tom самый дорогой");
        else if (Pit.getPrice() > Smit.getPrice())
            System.out.println("Pit самый дорогой");
        else System.out.println("Smit самый дорогой");

    }
}
