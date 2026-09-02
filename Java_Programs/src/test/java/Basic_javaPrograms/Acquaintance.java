package Basic_javaPrograms;

class Acquaintance {
    public String name;

    public Acquaintance(String name) {
        this.name = name;
    }

    public void getStatus() {
        System.out.println(name + " is just an acquaintance.");
    }
}

class Friend extends Acquaintance {
    public String hometown;

    public Friend(String name, String hometown) {
        super(name);
        this.hometown = hometown;
    }

    public void getStatus() {
        System.out.println(name + " is a friend and he is from " + hometown + ".");
    }
}

class BestFriend extends Friend {
    public String favoriteSong;

    public BestFriend(String name, String hometown, String favoriteSong) {
        super(name, hometown);
        this.favoriteSong = favoriteSong;
    }

    public void getStatus() {
        System.out.println(name + " is my best friend. He is from " + hometown + " and his favorite song is " + favoriteSong + ".");
    }
    
}

class Demo{
	public static void main(String[] args) {
		BestFriend ac = new BestFriend("arpitha","pune","hellllo");
		ac.getStatus();
	}
	
}

