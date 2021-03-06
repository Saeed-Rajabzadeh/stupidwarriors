/*
 * Copyright (C) 2014 Saeed Masoumi & Saeed Rajabzade
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * this tower is for Second Team
 * @author Saeed Masoumi
 */
public class generalTower extends Tower{
    public generalTower(Cell col,Cell row){
        this.row = row;
        this.col = col;
        this.attackPowerSoldier = 100;
        this.attackPowerTank = 20 ;
        this.realoadTime = 500;
        this.finalRealoadTime = 500;
        this.health = 5000;
        this.powerReflection =  0 ;
        this.cost = 300 ;
        this.range = 7;
    }
}
