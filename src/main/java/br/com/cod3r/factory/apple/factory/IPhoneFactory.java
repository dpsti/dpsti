package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.*;

import java.util.Optional;

public abstract class IPhoneFactory {

    public static IPhone ordenarTelefones(String geracao, String nivel){
        IPhone device = null;

        if("11".equals(geracao)){
            if("padrao".equals(nivel)) {
                device = new IPhone11();
            } else if ("hi".equals(nivel)) {
                device = new IPhone11Pro();

            }
        }


        if("x".equals(geracao)){
            if("padrao".equals(nivel)) {
                device = new IPhoneX();
            } else if ("hi".equals(nivel)) {
                device = new IPhoneXSMax();
            }
        }

        if(Optional.ofNullable(device).isPresent()){
            device.getHardware();
            device.pack();
            device.certificates();
            device.assemble();
        }

         return device;

    }

	
}
