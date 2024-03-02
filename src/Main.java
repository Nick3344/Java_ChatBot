package ChatBot;
class Main{
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();

        System.out.println("User: Hello");
        String response = chatbot.respond("Hello");
        System.out.println("Chatbot: " + response);

        }
    }
}