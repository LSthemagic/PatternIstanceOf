/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patternmatchinginstanceof;

/**
 *
 * @author Aluno
 */
public class App {
    
    public static void executarAntigo(User user){
        if (user instanceof Homem){
            Homem h = (Homem) user;
            h.funcaoHomem();
        }
        if (user instanceof Mulher){
            Mulher m = (Mulher) user;
            m.funcaoMulher();
        }
    }
    
    
    public static void executarNovo(User user){
        if (user instanceof Homem homem){
            homem.funcaoHomem();
        }
        if (user instanceof Mulher mulher){
            mulher.funcaoMulher();
        }
    }
    
    
}
