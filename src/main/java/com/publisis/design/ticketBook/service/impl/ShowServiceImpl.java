package com.publisis.design.ticketBook.service.impl;

import com.publisis.design.ticketBook.model.Screen;
import com.publisis.design.ticketBook.model.Show;
import com.publisis.design.ticketBook.repository.ScreenRepository;
import com.publisis.design.ticketBook.repository.ShowRespository;
import com.publisis.design.ticketBook.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ShowServiceImpl implements ShowService {

    private final ShowRespository showRespository;
    private final ScreenRepository screenRepository;

    @Override
    public List<Show> getShowsByTheaterId(Long theaterId) {
        List<Screen> screenList = screenRepository.findByTheaterId(theaterId);
        return screenList.stream().map(Screen::getId)
                .map(id -> showRespository.findByScreenId(id)).flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
