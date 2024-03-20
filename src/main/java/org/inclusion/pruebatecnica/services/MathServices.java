package org.inclusion.pruebatecnica.services;

import org.springframework.stereotype.Service;

@Service
public class MathServices {

    public int findMaximumNumber(int x, int y, int z) {
        int result = (z - y) / x;
        return x * result + y;
    }

}
