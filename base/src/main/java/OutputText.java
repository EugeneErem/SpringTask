public class OutputText {

    String message;
    WithdrawResources withdrawResources;

    public OutputText(WithdrawResources withdrawResources) {
        this.withdrawResources = withdrawResources;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void init() {
        this.message = "Good day";
        System.out.println("\nBase module files:");
        withdrawResources.printResources("/Users/Eugene/IdeaProjects/SpringTask/base/src/main/resources/base");
    }

}
