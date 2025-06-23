public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("アベル",100,"鋼の剣");
        Slime s = new Slime("スライムA",30);
        System.out.println("冒険が始まる…！");
        h.showStatus();
        s.showStatus();
        System.out.println("戦闘開始！");
        h.attack(s);
        s.showStatus();
        s.attack(h);
        h.showStatus();
        h.Heal();
        h.showStatus();
        h.attack(s);
        h.attack(s);
        h.attack(s);
        System.out.println("最終ステータス");
        h.showStatus();
        s.showStatus();
        System.out.println(h.name+"は生きている"+h.isAlive());
        System.out.println(s.name+"は生きている"+s.isAlive());
        System.out.println("ーー参照の確認ーー");
        Character abel = h;
        Character partyMember = abel;
        partyMember.hp -= 50;
        System.out.println("partyMember経由でHPを減らした後：");
        abel.showStatus();
    }
}