package com.codenjoy.dojo.web.rest.pojo;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 - 2019 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.codenjoy.dojo.services.PointImpl;
import com.codenjoy.dojo.services.hero.HeroData;

public class PHeroData implements HeroData {
    private Object additionalData;
    private PointImpl coordinate;
    private boolean multiplayer;
    private int level;

    public PHeroData() {
        // do nothing
    }

    public PHeroData(HeroData data) {
        additionalData = data.getAdditionalData();
        coordinate = new PointImpl(data.getCoordinate());
        multiplayer = data.isMultiplayer();
        level = data.getLevel();
    }

    @Override
    public PointImpl getCoordinate() {
        return coordinate;
    }

    @Override
    public boolean isMultiplayer() {
        return multiplayer;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public Object getAdditionalData() {
        return additionalData;
    }


    public void setAdditionalData(Object additionalData) {
        this.additionalData = additionalData;
    }

    public void setCoordinate(PointImpl coordinate) {
        this.coordinate = coordinate;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}