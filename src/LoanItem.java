public abstract class LoanItem {
    private String title;

    LoanItem(String title) {
        setTitle(title);
    }
    // Setters
    void setTitle(String title) {
        this.title = title;
    }
    // Getters
    String getTitle() {
        return title;
    }
}
