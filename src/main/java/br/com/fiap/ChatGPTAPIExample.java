package br.com.fiap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatGPTAPIExample {

    private static final long MAX_TOKENS = 1000;
    private static final float TEMPERATURE = 1;
    private static final String MODEL = "text-davinci-003";
    private static final String ROLE = "system";

    public static String chatGPT(String prompt) throws Exception {

        String url = "https://api.openai.com/v1/chat/completions";
        //Obtenha no site da OpenAI
        String apiKey = "sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

        String model = "gpt-3.5-turbo";

        StringBuffer response = null;
        OutputStreamWriter writer = null;
        BufferedReader br = null;

        try {
            // Code for interacting with the ChatGPT API
            URL obj = new URL( url );
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod( "POST" );
            connection.setRequestProperty( "Authorization", "Bearer " + apiKey );
            connection.setRequestProperty( "Content-Type", "application/json" );

            Message mensagem = new Message();
            mensagem.setContent( prompt ).setRole( ROLE );

            List<Message> mensagens = new ArrayList<>();
            mensagens.add( mensagem );

            RequestBody requestBody = new RequestBody();
            requestBody.setMaxTokens( MAX_TOKENS )
                    .setTemperature( TEMPERATURE )
                    .setModel( MODEL )
                    .setMessages( mensagens );

            Gson gson = new GsonBuilder().create();
            String body = gson.toJson( requestBody );
            System.out.println( body );

            connection.setDoOutput( true );
            writer = new OutputStreamWriter( connection.getOutputStream() );
            writer.write( body );
            writer.flush();
            writer.close();

            // Response from ChatGPT
            br = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );
            String line = "";
            response = new StringBuffer();

            while ((line = br.readLine()) != null) {
                response.append( line );
            }
            // calls the method to extract the message.
            return extractMessageFromJSONResponse( response.toString() );
        } catch (Exception e) {
            var msg = "Erro ao acessar o Chat GPT: " + e.getMessage();
            System.err.println( msg );

        } finally {
            if (Objects.nonNull( br )) br.close();
        }
        return "";
    }

    public static String extractMessageFromJSONResponse(String response) {
        int start = response.indexOf( "content" ) + 11;
        int end = response.indexOf( "\"", start );
        return response.substring( start, end );
    }

    public static void main(String[] args) throws Exception {
        System.out.println( chatGPT( "Gere uma lista com uma rotina de 5 dias de treino de fiseoterapia (cada dia sendo um item da lista) a partir de 27/10/2023 para uma pessoa com deficiencia ( Braco esquerdo amputado na altura do ombro ) em reabilitacao, pesando 58 Kg, com 1,77 metros de altura e com 38 anos de idade." ) );
    }

}