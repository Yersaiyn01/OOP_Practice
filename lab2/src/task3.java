public class task3 {
    private int hour;
    private int minute;
    private int second;
    
    public task3(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public String toStandard() {
        String period = "AM";
        int h = hour;
        
        if (h >= 12) {
            period = "PM";
            if (h > 12) {
                h -= 12;
            }
        }
        if (h == 0) {
            h = 12;
        }
        
        return String.format("%02d:%02d:%02d %s", h, minute, second, period);
    }
    
    public void add(task3 other) {
        this.second += other.second;
        this.minute += other.minute;
        this.hour += other.hour;
        
        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second %= 60;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute %= 60;
        }
        if (this.hour >= 24) {
            this.hour %= 24;
        }
    }
    
    public static void main(String[] args) {
        task3 t1 = new task3(23, 11, 11);
        task3 t2 = new task3(3, 56, 43);
        
        System.out.println("Time 1 (Universal): " + t1.toUniversal());
        System.out.println("Time 1 (Standard): " + t1.toStandard());
        System.out.println("Time 2 (Universal): " + t2.toUniversal());
        System.out.println("Time 2 (Standard): " + t2.toStandard());
        
        t1.add(t2);
        System.out.println("After adding t2 to t1: " + t1.toUniversal());
    }
}