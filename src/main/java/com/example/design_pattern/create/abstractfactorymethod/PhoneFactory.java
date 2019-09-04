/**
 * Copyright (C), 2015-2019
 * FileName: PhoneFactory
 * Author:   r
 * Date:     2019-09-03 16:08
 */
package com.example.design_pattern.create.abstractfactorymethod;

/**
 * 〈手机工厂类〉
 * @author r
 * @date 2019-09-03
 * @version 1.0.0
 */
public class PhoneFactory extends AbstractFactory {

    @Override
    public IPhone getPhone(PhoneEnum phoneType) {
        switch (phoneType) {
            case OPPO:
                return new OppoPhoneImpl();
            case IPHONE:
                return new IphonePhoneImpl();
        }
        return null;
    }

    @Override
    public IComputer getComputer(ComputerEnum computerType) {
        return null;
    }
}
