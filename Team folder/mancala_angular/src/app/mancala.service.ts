import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MancalaService {

  constructor(private http: HttpClient) { }

  public getGameState() {
    return this.http.get('http://localhost:40080/gamestate')
  }

  public postPlayTurn(turn) {
    return this.http.post('http://localhost:40080/playturn', turn)
  }
}
