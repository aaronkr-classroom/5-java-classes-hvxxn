public class Cat extends Animal { // cat is-a Animal
    public void sound() { // 메서드 오버라이딩 (다를 객체에서 덮어쓰기)

String breed;
String color;

void eat() {
    System.out.println(this.getName() + " 먹이를 먹다~");
}

void scratch() {
    System.out.println(this.getName() + " 발톱으로 할퀴다");
}

        System.out.println(this.getName() + " 야옹, 야용, meow, meow~~");
    }
}
