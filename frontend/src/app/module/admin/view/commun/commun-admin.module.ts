import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from "primeng/fileupload";

import { ProfesseurCreateAdminComponent } from './professeur-admin/create-admin/professeur-create-admin.component';
import { ProfesseurEditAdminComponent } from './professeur-admin/edit-admin/professeur-edit-admin.component';
import { ProfesseurViewAdminComponent } from './professeur-admin/view-admin/professeur-view-admin.component';
import { ProfesseurListAdminComponent } from './professeur-admin/list-admin/professeur-list-admin.component';
import { ClasseRoomCreateAdminComponent } from './classe-room-admin/create-admin/classe-room-create-admin.component';
import { ClasseRoomEditAdminComponent } from './classe-room-admin/edit-admin/classe-room-edit-admin.component';
import { ClasseRoomViewAdminComponent } from './classe-room-admin/view-admin/classe-room-view-admin.component';
import { ClasseRoomListAdminComponent } from './classe-room-admin/list-admin/classe-room-list-admin.component';
import { NiveauCreateAdminComponent } from './niveau-admin/create-admin/niveau-create-admin.component';
import { NiveauEditAdminComponent } from './niveau-admin/edit-admin/niveau-edit-admin.component';
import { NiveauViewAdminComponent } from './niveau-admin/view-admin/niveau-view-admin.component';
import { NiveauListAdminComponent } from './niveau-admin/list-admin/niveau-list-admin.component';
import { EtudiantCreateAdminComponent } from './etudiant-admin/create-admin/etudiant-create-admin.component';
import { EtudiantEditAdminComponent } from './etudiant-admin/edit-admin/etudiant-edit-admin.component';
import { EtudiantViewAdminComponent } from './etudiant-admin/view-admin/etudiant-view-admin.component';
import { EtudiantListAdminComponent } from './etudiant-admin/list-admin/etudiant-list-admin.component';
import { DisciplineCreateAdminComponent } from './discipline-admin/create-admin/discipline-create-admin.component';
import { DisciplineEditAdminComponent } from './discipline-admin/edit-admin/discipline-edit-admin.component';
import { DisciplineViewAdminComponent } from './discipline-admin/view-admin/discipline-view-admin.component';
import { DisciplineListAdminComponent } from './discipline-admin/list-admin/discipline-list-admin.component';
import { NoteDisciplineCreateAdminComponent } from './note-discipline-admin/create-admin/note-discipline-create-admin.component';
import { NoteDisciplineEditAdminComponent } from './note-discipline-admin/edit-admin/note-discipline-edit-admin.component';
import { NoteDisciplineViewAdminComponent } from './note-discipline-admin/view-admin/note-discipline-view-admin.component';
import { NoteDisciplineListAdminComponent } from './note-discipline-admin/list-admin/note-discipline-list-admin.component';
import { NoteMatiereCreateAdminComponent } from './note-matiere-admin/create-admin/note-matiere-create-admin.component';
import { NoteMatiereEditAdminComponent } from './note-matiere-admin/edit-admin/note-matiere-edit-admin.component';
import { NoteMatiereViewAdminComponent } from './note-matiere-admin/view-admin/note-matiere-view-admin.component';
import { NoteMatiereListAdminComponent } from './note-matiere-admin/list-admin/note-matiere-list-admin.component';
import { MatiereCreateAdminComponent } from './matiere-admin/create-admin/matiere-create-admin.component';
import { MatiereEditAdminComponent } from './matiere-admin/edit-admin/matiere-edit-admin.component';
import { MatiereViewAdminComponent } from './matiere-admin/view-admin/matiere-view-admin.component';
import { MatiereListAdminComponent } from './matiere-admin/list-admin/matiere-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    ProfesseurCreateAdminComponent,
    ProfesseurListAdminComponent,
    ProfesseurViewAdminComponent,
    ProfesseurEditAdminComponent,
    ClasseRoomCreateAdminComponent,
    ClasseRoomListAdminComponent,
    ClasseRoomViewAdminComponent,
    ClasseRoomEditAdminComponent,
    NiveauCreateAdminComponent,
    NiveauListAdminComponent,
    NiveauViewAdminComponent,
    NiveauEditAdminComponent,
    EtudiantCreateAdminComponent,
    EtudiantListAdminComponent,
    EtudiantViewAdminComponent,
    EtudiantEditAdminComponent,
    DisciplineCreateAdminComponent,
    DisciplineListAdminComponent,
    DisciplineViewAdminComponent,
    DisciplineEditAdminComponent,
    NoteDisciplineCreateAdminComponent,
    NoteDisciplineListAdminComponent,
    NoteDisciplineViewAdminComponent,
    NoteDisciplineEditAdminComponent,
    NoteMatiereCreateAdminComponent,
    NoteMatiereListAdminComponent,
    NoteMatiereViewAdminComponent,
    NoteMatiereEditAdminComponent,
    MatiereCreateAdminComponent,
    MatiereListAdminComponent,
    MatiereViewAdminComponent,
    MatiereEditAdminComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
  ],
  exports: [
  ProfesseurCreateAdminComponent,
  ProfesseurListAdminComponent,
  ProfesseurViewAdminComponent,
  ProfesseurEditAdminComponent,
  ClasseRoomCreateAdminComponent,
  ClasseRoomListAdminComponent,
  ClasseRoomViewAdminComponent,
  ClasseRoomEditAdminComponent,
  NiveauCreateAdminComponent,
  NiveauListAdminComponent,
  NiveauViewAdminComponent,
  NiveauEditAdminComponent,
  EtudiantCreateAdminComponent,
  EtudiantListAdminComponent,
  EtudiantViewAdminComponent,
  EtudiantEditAdminComponent,
  DisciplineCreateAdminComponent,
  DisciplineListAdminComponent,
  DisciplineViewAdminComponent,
  DisciplineEditAdminComponent,
  NoteDisciplineCreateAdminComponent,
  NoteDisciplineListAdminComponent,
  NoteDisciplineViewAdminComponent,
  NoteDisciplineEditAdminComponent,
  NoteMatiereCreateAdminComponent,
  NoteMatiereListAdminComponent,
  NoteMatiereViewAdminComponent,
  NoteMatiereEditAdminComponent,
  MatiereCreateAdminComponent,
  MatiereListAdminComponent,
  MatiereViewAdminComponent,
  MatiereEditAdminComponent,
  ],
  entryComponents: [],
})
export class CommunAdminModule { }