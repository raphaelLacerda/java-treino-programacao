package br.com.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CaminhoArquivo {


    private Path diretorio;

    private Path arquivo;

    private CaminhoArquivo(Path diretorio, Path arquivo) {
        super();
        this.diretorio = diretorio;
        this.arquivo = arquivo;
    }

    public Path getDiretorio() {
        return diretorio;
    }

    public Path getArquivo() {
        return arquivo;
    }

    /**
     * @param id
     * @return
     */
    public static CaminhoArquivo getInstance(Integer id) {
        String nomeDoDiretorio = "/tmp/";
        String localDoArquivo; 
        int s = 1;
        String nomeCompleto;
        for(int i = 1; i <= id; i++){
            if(i <= 1000){
                s = 1;
            }
            else if (i % 1000 == 1){
                s++;
            }           
        }
        localDoArquivo = nomeDoDiretorio + Integer.toString(s);
        nomeCompleto = localDoArquivo + '/' + id;
        return new CaminhoArquivo(Paths.get(localDoArquivo), Paths.get(nomeCompleto));
    }







        /* String b = "/tmp/";(nomeDoArquivo)
        String direetorio = null;
        String d = null; e(agora definida como variável 1 = nomeDoDiretorio; variável 2 = localDoArquivo)
        if (id <= 1000) {
            d = b + id;
        } else {
            int i = id;
            direetorio = d + i;
            boolean nome = true;
            while (nome) {
                if (id <= (i * 1000)) {
                    d = b + i;
                    direetorio = d + i;
                }
                i++;
            }
        }*/
       // return new CaminhoArquivo(Paths.get(d), Paths.get(direetorio));

    }


