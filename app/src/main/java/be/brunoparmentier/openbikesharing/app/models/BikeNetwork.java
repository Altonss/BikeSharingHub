/*
 * Copyright (c) 2014-2015 Bruno Parmentier.
 *
 * This file is part of BikeSharingHub.
 * BikeSharingHub incorporates a modified version of OpenBikeSharing
 *
 * BikeSharingHub is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BikeSharingHub is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BikeSharingHub.  If not, see <http://www.gnu.org/licenses/>.
 */

package be.brunoparmentier.openbikesharing.app.models;

import java.util.ArrayList;

/**
 * Represents a bike network and its stations.
 */
public class BikeNetwork extends BikeNetworkInfo {
    private ArrayList<Station> stations;

    public BikeNetwork(String id, String name, String company, BikeNetworkLocation location, ArrayList<Station> stations) {
        super(id, name, company, location);
        this.stations = stations;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }
}
