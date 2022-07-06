package trybe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
    public  static  void main(String[] args){
        ReadExample readExample = new ReadExample();
        readExample.lerConteudoArquivo();
    }

    private File meuArquivo;

    public ReadExample(){
        this.meuArquivo = new File("C:\\Users\\maiaw\\banco.txt");
    }

    public void lerConteudoArquivo() {
        FileReader leitorArquivo = null;
        BufferedReader bufferedLeitor = null;

        System.out.println(meuArquivo.exists());

        if (meuArquivo.exists()) {
            try {
                leitorArquivo = new FileReader(meuArquivo);
                bufferedLeitor = new BufferedReader(leitorArquivo);

                String conteudoLinha = bufferedLeitor.readLine();

                while (conteudoLinha != null) {
                    System.out.println(conteudoLinha);
                    conteudoLinha = bufferedLeitor.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                this.fecharObjetos(leitorArquivo, bufferedLeitor);
            }
        }
    }

    private void fecharObjetos(FileReader fileReader, BufferedReader bufferedReader) {
        try {
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
