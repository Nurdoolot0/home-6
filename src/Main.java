public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("gun", "AK-47", 49);

        Weapon weapon1 = new Weapon("arrow", "bow", 35);

        Weapon weapon2 = new Weapon("arrow", "bow", 6);

        Boss boss = new Boss(500, 50, weapon);

        Skeleton skeleton = new Skeleton(200, 30, weapon1);
        Skeleton skeleton1 = new Skeleton(55, 15, weapon2);

        System.out.println(" BOSS INFO: " + "\nBoss health: " + boss.getHealth());

        System.out.println("Boss damage: " + boss.getDamage());

        System.out.println("Boss weapon type: " + boss.getWeapon().getType());

        System.out.println("Boss weapon name: " + boss.getWeapon().getName());

        ////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(" SKELETON INFO: " + "\nSkeleton health: " + skeleton.getHealth());

        System.out.println("Skeleton damage: " + skeleton.getDamage());

        System.out.println("Skeleton weapon type: " + skeleton.getWeapon().getType());

        System.out.println("Skeleton weapon name: " + skeleton.getWeapon().getName());

        System.out.println("Skeleton arrow quantity(количество): " + skeleton.getWeapon().getQuantity());

       ////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(" SKELETON 2 INFO: " + "\nSkeleton health: " + skeleton1.getHealth());

        System.out.println("Skeleton 2 damage: " + skeleton1.getDamage());

        System.out.println("Skeleton 2 weapon type: " + skeleton1.getWeapon().getType());

        System.out.println("Skeleton 2 weapon name: " + skeleton1.getWeapon().getName());

        System.out.println("Skeleton1 arrow quantity(количество): " + skeleton1.getWeapon().getQuantity());



    }
    }
