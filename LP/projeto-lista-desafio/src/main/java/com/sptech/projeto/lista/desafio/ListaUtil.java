package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            inteiros.remove(valor);
        }
    }

    public Integer count() {
        return inteiros.size();
    }

    public Integer countPares() {
        Integer qtdPares = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            qtdPares += inteiros.get(i) % 2 == 0 ? 1 : 0;
        }
        return qtdPares;
    }

    public Integer countImpares() {
        Integer qtdImpares = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            qtdImpares += inteiros.get(i) % 2 == 1 ? 1 : 0;
        }
        return qtdImpares;
    }

    public Integer somar() {
        Integer soma = 0;
        for (Integer value : inteiros) {
            soma += value;
        }
        return soma;
    }

    public Integer getMaior() {
        Integer maxValue = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            Integer get = inteiros.get(i);
            if (get > maxValue) {
                maxValue = get;
            }
        }
        return maxValue;
    }

    public Integer getMenor() {
        Integer minValue = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            Integer get = inteiros.get(i);
            if (get < minValue) {
                minValue = get;
            }
        }
        return minValue;
    }

    public Boolean hasDuplicidade() {
        for (int i = 0; i < inteiros.size() - 1; i++) {
            Integer primeiroNumero = inteiros.get(i);
            for (int j = i + 1; j < inteiros.size(); j++) {
                Integer segundoNumero = inteiros.get(j);
                if (primeiroNumero == segundoNumero) {
                    return true;
                }
            }
        }
        return false;

    }
}
