package br.com.fiap;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {

        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("text-davinci-003")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);

        return resposta.getChoices().get(0).getText();
        //keytool -import -alias example -keystore “C:\Program Files\Java\jdk-18.0.1\lib\security\cacerts” -file
    }
}
