import { Component, OnInit } from '@angular/core';
import { MancalaService } from './mancala.service';
import { ReversePipe } from './reverse.pipe';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ReversePipe]
})
export class AppComponent implements OnInit {
  title = 'mancala';
  player1: any;
  player2: any;
  gameState: any;
  errorMessage: string;

  constructor(private mancalaService: MancalaService) {}

  ngOnInit(): void {
    this.getGameState();
  }

  public getGameState() {
    this.mancalaService.getGameState().subscribe((state: any) => {
      this.gameState = state;
      this.player1 = this.gameState.players[0];
      this.player2= this.gameState.players[1];
    })
  }

  public playTurn(playerId, bucketId) {
    this.errorMessage = "";
    
    console.debug(playerId, bucketId)
    this.mancalaService.postPlayTurn({playerId, bucketId}).subscribe((response: any) => {
      if (response.result === "Wait") {
        this.errorMessage = "Wait for your turn"
      } else {
        this.getGameState();
      }
    })
  }
}
