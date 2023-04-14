import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

 class Question {
        private final String question;
        private final byte rightAnswerNumber;
        private String[] answers;

        public Question(String question, String[] answers, byte rightAnswerNumber) {
                this.question = question;
                this.rightAnswerNumber = rightAnswerNumber;
                this.answers = answers;
        }

        public byte getRightAnswerNumber() {
                return this.rightAnswerNumber;
        }

        public String toString() {
                String var10000 = this.question;
                return var10000 + "\n Варианты ответов: " + Arrays.toString(this.answers);
        }

        public static void main(String[] args) {
                System.out.println("Хорошо ли вы знаете наш город? Давайте проверим!");
                System.out.println("Чтобы пройти викторину, ответьте на несколько вопросов");
                System.out.println(" ");
                ArrayList<Question> questions = new ArrayList();
                questions.add(new Question("1 вопрос: в каком году была основана Обоянь?", new String[]{"1-1890", "2-1649", "3-1550"}, (byte)2));
                questions.add(new Question("2 вопрос: В честь какого учёного названа главная площадь города? ", new String[]{"1-Ломоносова", "2-Петрова", "3-Циолковского"}, (byte)2));
                questions.add(new Question("3 вопрос: главный городской парк назван в честь... ", new String[]{"1-...Гагарина", "2-...Юных Пионеров", "3-...Рефолюционеров"}, (byte)2));
                questions.add(new Question("4 вопрос: Как называется главная улица города?", new String[]{"1-Красноармейская", "2-Курская", "3-Ленина"}, (byte)3));
                questions.add(new Question("5 вопрос: На гербе Обояни изображён...", new String[]{"1-Хорёк", "2-Ласка", "3-Куропатка"}, (byte)1));
                questions.add(new Question("6 вопрос: Обоянь знаменита своим(и)...", new String[]{"1-Стихами", "2-Яблоками", "3-Историческим прошлым", "4-Культурным наследием"}, (byte)2));
                questions.add(new Question("7 вопрос: самым крупным предприятием города является...", new String[]{"1-Артель", "2-Восток", "3-Изоплит", "4-Акватон"}, (byte)1));
                questions.add(new Question("8 вопрос: Когда отмечается день города?", new String[]{"1-19 февраля", "2-1 мая", "3-8 мая", "4-27 августа"}, (byte)4));
                questions.add(new Question("9 вопрос: сколько школ существует в городе?", new String[]{"1-одна", "2-две", "3-три", "4-четыре"}, (byte)3));
                questions.add(new Question("10 вопрос: какой из трёх храмов Обояни является главным?", new String[]{"1-Свято-Троицкий собор", "2-Смоленский храм", "3-Собор Александра Невского"}, (byte)1));
                Scanner sc = new Scanner(System.in);
                int[] rightAnswersCounter = new int[1];
                questions.forEach((question) -> {
                        System.out.println(question);
                        if (sc.nextByte() == question.getRightAnswerNumber()) {
                                int var10002 = rightAnswersCounter[0]++;
                        }

                });
                System.out.println("Всего верных ответов:" + rightAnswersCounter[0] + " из 10");
        }
}
