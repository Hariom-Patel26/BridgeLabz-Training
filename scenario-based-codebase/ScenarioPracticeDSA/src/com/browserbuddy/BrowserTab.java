package com.browserbuddy;

class BrowserTab {

    private Page current;
    public void visit(String url) {
        Page newPage = new Page(url);

        if (current != null) {
            current.next = null;      
            newPage.prev = current;
            current.next = newPage;
        }

        current = newPage;
        System.out.println("Visited: " + url);
    }
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No forward page");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.url);
    }

    public String getCurrentPage() {
        return current != null ? current.url : null;
    }
}
