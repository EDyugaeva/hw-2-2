package pro.sky.java.course2.hw22.service;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CountService {
    private int counter;

    @Override
    public int getRequestCount() {
        return ++counter;
    }

}
