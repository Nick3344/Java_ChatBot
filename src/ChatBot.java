import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Chatbot {

    public String respond(String userInput) throws Exception {
        // Load greetings from file
        BufferedReader reader = new BufferedReader(new FileReader("resources/greetings.txt"));
        String greeting = reader.readLine();
        reader.close();

        // Randomly choose a greeting
        Random random = new Random();
        String[] responses = {
                greeting,
                "How can I assist you today?",
                "What would you like to talk about?"
        };
        int randomIndex = random.nextInt(responses.length);
        String response = responses[randomIndex];

        return response;
    }