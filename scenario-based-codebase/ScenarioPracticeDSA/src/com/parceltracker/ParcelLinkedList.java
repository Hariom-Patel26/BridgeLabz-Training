package com.parceltracker;

public class ParcelLinkedList {
    private ParcelStage head;

    public void addStage(String stageName) {
        ParcelStage newStage = new ParcelStage(stageName);
        if (head == null) {
            head = newStage;
            return;
        }
        ParcelStage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStage;
    }

    public void addIntermediateStage(String afterStage, String newStageName) {
        ParcelStage temp = head;
        while (temp != null && !temp.stageName.equalsIgnoreCase(afterStage)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Checkpoint not found. Parcel may be lost.");
            return;
        }
        ParcelStage newStage = new ParcelStage(newStageName);
        newStage.next = temp.next;
        temp.next = newStage;
    }

    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel tracking data missing.");
            return;
        }
        ParcelStage temp = head;
        while (temp != null) {
            System.out.print(temp.stageName);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
