package br.com.fiap;

public class Main {


    public static void main(String[] args) {
        ConsultaChatGPT gpt = new ConsultaChatGPT();
        String traducao = gpt.obterTraducao("""
                I used to think that I could not go on
                And life was nothing but an awful song
                But now I know the meaning of true love
                I'm leaning on the everlasting arms
                If I can see it, then I can do it
                If I just believe it, there's nothing to it
                I believe I can fly
                I believe I can touch the sky
                I think about it every night and day
                Spread my wings and fly away
                I believe I can soar
                I see me running through that open door
                I believe I can fly
                I believe I can fly
                I believe I can fly (woo)
                See I was on the verge of breaking down
                Sometimes silence can seem so loud
                There are miracles in life I must achieve
                But first I know it starts inside of me
                If I can see it, then I can be it
                If I just believe it, there's nothing to it
                I believe I can fly
                I believe I can touch the sky
                I think about it every night and day
                Spread wings and fly away
                I believe I can soar
                I see me running through that open door
                I believe I can fly
                I believe I can fly
                I believe I can fly (woo!)
                Hey, 'cause I believe in you
                Oh
                If I can see it (woo!), then I can do it (I can do it)
                If I just believe it, there's nothing to it (hey)
                I believe I can fly (woo!)
                I believe I can touch the sky
                I think about it every night and day
                Spread my wings and fly away
                I believe I can soar
                I see me running through that open door
                I believe I can fly (I can fly)
                I believe I can fly (I can fly)
                I believe I can fly (I can fly)
                If I just spread my wings (I can fly)
                I can fly (I can fly)
                I can fly (I can fly)
                I can fly (I can fly)
                If I just spread my wings (I can fly)
                I can fly (I can fly, I can fly)
                Woo (I can fly)
                Hm-mm... fly, fly, fly
                """);


        System.out.println(traducao);
    }
}
