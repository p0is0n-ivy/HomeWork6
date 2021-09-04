package project6;

public abstract class Animals {
    protected String name;
    protected static int stopRun;
    protected static int stopSwim;
    public Animals(String name, int stopRun, int stopSwim){
        this.name = name;
        this.stopRun = stopRun;
        this.stopSwim = stopSwim;
    }
     public void run (int lenghtRun) {
         {
             if (lenghtRun > stopRun) {
                 System.out.println("Sorry, " + name + " can run no more than " + stopRun + " m.");
             } else {
                 if (lenghtRun >= 0) {
                     System.out.println("Сongratulations! " + name + " ran " + lenghtRun + " m!");
                 } else {
                     System.out.println("You entered a negative number.");
                 }
             }
         }
     }
    public void swim (int lenghtSwim)
        {     if (lenghtSwim > stopSwim) {
            System.out.println(name + " can swim no more than " + stopSwim + " m.");
        } else {
            if (lenghtSwim >=0) {
                System.out.println("Сongratulations! " + name + " swam " + lenghtSwim + " m!");
            }
            else {
                System.out.println("You entered a negative number.");
            }
        }
        }
    }

